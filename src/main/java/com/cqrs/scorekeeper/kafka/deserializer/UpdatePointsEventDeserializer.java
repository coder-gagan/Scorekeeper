package com.cqrs.scorekeeper.kafka.deserializer;

import com.cqrs.scorekeeper.model.library.UpdatePointsEvent;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import org.apache.kafka.common.serialization.Deserializer;

public class UpdatePointsEventDeserializer implements Deserializer<UpdatePointsEvent> {
	@Override
	public UpdatePointsEvent deserialize(String topic, byte[] data) {
		// Convert byte array to UpdatePointsEvent
		try (ByteArrayInputStream bis = new ByteArrayInputStream(data);
				ObjectInputStream ois = new ObjectInputStream(bis)) {
			return (UpdatePointsEvent) ois.readObject();
		} catch (Exception e) {
			// Handle deserialization error
			e.printStackTrace();
			return null;
		}
	}
}
