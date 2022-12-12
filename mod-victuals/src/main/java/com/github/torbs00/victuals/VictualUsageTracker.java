package com.github.torbs00.victuals;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class VictualUsageTracker {

    private final Map<UUID, Long> usageTracker;

    VictualUsageTracker() {
        usageTracker = new HashMap<>();
    }

    boolean attemptUsage(UUID uuid) {
        if(usageTracker.containsKey(uuid)) {
            long value = usageTracker.get(uuid);
            if(System.currentTimeMillis() <= value) {
                return false;
            }
            usageTracker.remove(uuid);
        }
        return true;
    }
}
