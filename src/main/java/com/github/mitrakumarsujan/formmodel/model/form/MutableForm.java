package com.github.mitrakumarsujan.formmodel.model.form;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
public class MutableForm implements Form {

	private static final long serialVersionUID = 6928780678671932333L;

	private String id;
	private String key;
	private FormTemplate template;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public FormTemplate getTemplate() {
		return template;
	}

	public void setUid(String uid) {
		this.id = uid;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setTemplate(FormTemplate template) {
		this.template = template;
	}

}
