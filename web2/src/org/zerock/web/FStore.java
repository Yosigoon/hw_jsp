package org.zerock.web;

import java.util.Arrays;

public class FStore {

	private String src;
	private String name;
	private String desc;

	public FStore(String src, String name, String desc) {
		super();
		this.src = src;
		this.name = name;
		this.desc = desc;
	}

	public FStore(byte[] arr) throws Exception {

		this.src = new String(Arrays.copyOfRange(arr, 0, 100)).trim();

		if (this.src == null || src.trim().length() == 0) {
			throw new Exception("ERROR");
		}

		this.name = new String(Arrays.copyOfRange(arr, 100, 200)).trim();
		this.desc = new String(Arrays.copyOfRange(arr, 200, 300)).trim();

	}

	public byte[] getBytes() {

		byte[] arr = new byte[500];

		byte[] tempSrc = this.getSrc().getBytes();
		byte[] tempName = this.getName().getBytes();
		byte[] tempDesc = this.getDesc().getBytes();

		System.arraycopy(tempSrc, 0, arr, 0, tempSrc.length);
		System.arraycopy(tempName, 0, arr, 100, tempName.length);
		System.arraycopy(tempDesc, 0, arr, 200, tempDesc.length);

		return arr;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "FStore [src=" + src + ", name=" + name + ", desc=" + desc + "]";
	}

}
