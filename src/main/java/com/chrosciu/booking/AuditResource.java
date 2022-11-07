package com.chrosciu.booking;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import lombok.RequiredArgsConstructor;

@Path("/audit")
@RequiredArgsConstructor
public class AuditResource {
    private final AuditService auditService;

    @GET
    public List<String> getAuditEntries() {
        return auditService.getAuditEntries();
    }
}
