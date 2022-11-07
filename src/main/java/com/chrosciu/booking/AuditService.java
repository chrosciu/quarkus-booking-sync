package com.chrosciu.booking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import lombok.SneakyThrows;
import lombok.extern.jbosslog.JBossLog;

@ApplicationScoped
@JBossLog
public class AuditService {
    private List<String> auditEntries = new ArrayList<>();

    @SneakyThrows
    public void auditTravel(String destination) {
        TimeUnit.SECONDS.sleep(3);
        auditEntries.add(destination);
    }

    public List<String> getAuditEntries() {
        return auditEntries.stream().collect(Collectors.toList());
    }
}
