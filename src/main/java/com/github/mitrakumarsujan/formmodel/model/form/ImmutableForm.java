package com.github.mitrakumarsujan.formmodel.model.form;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
public class ImmutableForm implements Form {

	private static final long serialVersionUID = 4560962341281647833L;

	private final Form delegatee;

	public ImmutableForm(Form delegatee) {
		this.delegatee = delegatee;
	}

	public ImmutableForm(String uid, String key, FormTemplate template) {
		this.delegatee = new Form() {

			private static final long serialVersionUID = -8933069325034718697L;

			@Override
			public String getUID() {
				return uid;
			}

			@Override
			public String getKey() {
				return key;
			}

			@Override
			public FormTemplate getTemplate() {
				return template;
			}

		};
	}

	@Override
	public String getUID() {
		return delegatee.getUID();
	}

	@Override
	public String getKey() {
		return delegatee.getKey();
	}

	@Override
	public FormTemplate getTemplate() {
		return delegatee.getTemplate();
	}

}
