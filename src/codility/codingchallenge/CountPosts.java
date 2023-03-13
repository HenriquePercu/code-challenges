package codility.codingchallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class CountPosts {

    Map<Long, Long> count(Map<String, UserStats>... visits) {

        HashMap<Long, Long> userStatistics = new HashMap<>();

        if (visits == null) {
            return userStatistics;
        }

        for (Map<String, UserStats> microservicesStats : visits) { // percorrendo cada microsserviço
            if (microservicesStats != null) {
                for (Map.Entry<String, UserStats> microserviceStat : microservicesStats.entrySet()) {

                    try {
                        if (microserviceStat.getValue() != null) {

                            Long key = Long.valueOf(microserviceStat.getKey());

                            Long newVisits = microserviceStat.getValue().getVisitCount().orElseThrow(() -> new NoSuchElementException());

                            Long updatedVisits = userStatistics.getOrDefault(key, 0L) + newVisits;

                            userStatistics.put(key, updatedVisits);
                        }

                    } catch (NumberFormatException | NoSuchElementException e) {
                        continue;
                    }
                }
            }
        }

        return userStatistics;
    }


}
