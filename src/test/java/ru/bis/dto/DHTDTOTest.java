package ru.bis.dto;

import org.apache.commons.lang3.StringUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.*;

class DHTDTOTest {
    @Test
    public void dhtUnmarshal() throws IOException {
        File file = new File("./data/dht/dhtJSON.txt");
        String json = inputStreamToString(new FileInputStream(file));
        DhtDTO dht = new ObjectMapper().readValue(json, DhtDTO.class);
        System.out.println(dht);
    }

    @Test
    public void dhtKafkaUnmarshal() throws IOException {
        File file = new File("./data/dht/dhtKafkaJSON.txt");
        String json = inputStreamToString(new FileInputStream(file));
        System.out.println(StringUtils.remove(StringUtils.strip(json,"\""), '\\'));
        DhtDTO dht = new ObjectMapper().readValue(StringUtils.remove(StringUtils.strip(json,"\""), '\\'), DhtDTO.class);
        System.out.println(dht);
    }

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

    }