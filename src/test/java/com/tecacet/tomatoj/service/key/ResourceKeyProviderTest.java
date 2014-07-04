package com.tecacet.tomatoj.service.key;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.tecacet.tomatoj.service.key.KeyProvider;
import com.tecacet.tomatoj.service.key.ResourceKeyProvider;

public class ResourceKeyProviderTest {

    @Test
    public void testGetApiKey() throws IOException {
	KeyProvider keyProvider = 
		new ResourceKeyProvider("dummy.properties", "key");
	assertEquals("DUMMY", keyProvider.getApiKey());
    }

    @Test(expected=IOException.class)
    public void testMissingResource() throws IOException {
	new ResourceKeyProvider("missing.properties", "key");
    }
}
