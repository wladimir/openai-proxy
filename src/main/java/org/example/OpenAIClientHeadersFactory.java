package org.example;


import jakarta.ws.rs.core.MultivaluedMap;
import org.eclipse.microprofile.rest.client.ext.ClientHeadersFactory;

public class OpenAIClientHeadersFactory implements ClientHeadersFactory {
    @Override
    public MultivaluedMap<String, String> update(MultivaluedMap<String, String> incomingHeaders,
                                                 MultivaluedMap<String, String> clientOutgoingHeaders) {
        clientOutgoingHeaders.add("Authorization", "Bearer " + System.getenv("OPENAI_API_KEY"));
        return clientOutgoingHeaders;
    }
}