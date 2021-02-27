package com.ezeeinfo.client.deserializer;

import com.ezeeinfo.model.TripStatus;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class TripStatusDeserialzer extends StdDeserializer<TripStatus> {

    public TripStatusDeserialzer() {
        this(null);
    }

    public TripStatusDeserialzer(Class<TripStatus> t) {
        super(t);
    }

    @Override
    public TripStatus deserialize(final JsonParser jsonParser,
                                  final DeserializationContext deserializationContext) throws IOException {
        TripStatus tripStatus = null;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if ("code".equals(jsonParser.getCurrentName())) {
                jsonParser.nextToken();
                tripStatus = TripStatus.valueOf(jsonParser.getValueAsString());
            }
        }
        return tripStatus;
    }


}