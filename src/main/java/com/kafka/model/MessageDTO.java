package com.kafka.model;

public class MessageDTO {

	private String name;
	private int partition;
	private int replic;
	private String key;
	private String body;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPartition() {
		return partition;
	}

	public void setPartition(int partition) {
		this.partition = partition;
	}

	public int getReplic() {
		return replic;
	}

	public void setReplic(int replic) {
		this.replic = replic;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "MessageDTO [name=" + name + ", partition=" + partition + ", replic=" + replic + ", key=" + key
				+ ", body=" + body + "]";
	}
}
