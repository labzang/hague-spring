package com.labzang.api.auth.controller;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RegisterController {

    @GetMapping("/register")
    @ResponseBody
    public String printFirstFivePassengers() {
        try {
            // CSV 파일 경로
            String csvFilePath = "src/main/resources/static/csv/train.csv";

            // CSV 파일 읽기
            FileReader reader = new FileReader(csvFilePath);
            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            List<Map<String, String>> passengers = new ArrayList<>();
            int count = 0;

            // 처음 5명의 데이터만 읽기
            for (CSVRecord record : parser) {
                if (count >= 5)
                    break;

                Map<String, String> passenger = new HashMap<>();
                passenger.put("PassengerId", record.get("PassengerId"));
                passenger.put("Survived", record.get("Survived"));
                passenger.put("Pclass", record.get("Pclass"));
                passenger.put("Name", record.get("Name"));
                passenger.put("Sex", record.get("Sex"));
                passenger.put("Age", record.get("Age"));
                passenger.put("SibSp", record.get("SibSp"));
                passenger.put("Parch", record.get("Parch"));
                passenger.put("Ticket", record.get("Ticket"));
                passenger.put("Fare", record.get("Fare"));
                passenger.put("Cabin", record.get("Cabin"));
                passenger.put("Embarked", record.get("Embarked"));

                passengers.add(passenger);
                count++;
            }

            parser.close();
            reader.close();

            // 터미널 출력용 결과 생성
            StringBuilder result = new StringBuilder();
            result.append("========================================\n");
            result.append("     타이타닉 승객 데이터 (처음 5명)\n");
            result.append("========================================\n\n");

            // 헤더 출력
            String[] headers = { "승객ID", "생존", "등급", "이름", "성별", "나이", "형제자매/배우자", "부모/자녀", "티켓", "요금", "객실", "승선항구" };
            String[] keys = { "PassengerId", "Survived", "Pclass", "Name", "Sex", "Age", "SibSp", "Parch", "Ticket",
                    "Fare", "Cabin", "Embarked" };

            String p = keys[0];

            // 헤더 출력 (간단한 형태)
            result.append(String.format("%-8s %-4s %-4s %-30s %-4s %-6s %-8s %-8s %-15s %-8s %-8s %-8s\n",
                    headers[0], headers[1], headers[2], headers[3], headers[4], headers[5],
                    headers[6], headers[7], headers[8], headers[9], headers[10], headers[11]));

            result.append(
                    "------------------------------------------------------------------------------------------------------------------------\n");

            // 데이터 출력
            for (Map<String, String> passenger : passengers) {
                result.append(String.format("%-8s %-4s %-4s %-30s %-4s %-6s %-8s %-8s %-15s %-8s %-8s %-8s\n",
                        passenger.get(keys[0]),
                        passenger.get(keys[1]),
                        passenger.get(keys[2]),
                        passenger.get(keys[3]).length() > 30 ? passenger.get(keys[3]).substring(0, 27) + "..."
                                : passenger.get(keys[3]),
                        passenger.get(keys[4]),
                        passenger.get(keys[5]),
                        passenger.get(keys[6]),
                        passenger.get(keys[7]),
                        passenger.get(keys[8]).length() > 15 ? passenger.get(keys[8]).substring(0, 12) + "..."
                                : passenger.get(keys[8]),
                        passenger.get(keys[9]),
                        passenger.get(keys[10]).length() > 8 ? passenger.get(keys[10]).substring(0, 5) + "..."
                                : passenger.get(keys[10]),
                        passenger.get(keys[11])));
            }

            result.append("\n========================================\n");

            return result.toString();

        } catch (IOException e) {
            return "CSV 파일을 읽는 중 오류가 발생했습니다: " + e.getMessage();
        }
    }
}
