package com.github.mitrakumarsujan.formmodel.model.form;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
public class ImmutableForm implements Form {

	private static final long serialVersionUID = 4560962341281647833L;

	private final Form delegetee;

	public ImmutableForm(Form delegatee) {
		this.delegetee = delegatee;
	}

	public ImmutableForm(String uid, String key, FormTemplate template) {
		this.delegetee = new Form() {

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
		return delegetee.getUID();
	}

	@Override
	public String getKey() {
		return delegetee.getKey();
	}

	@Override
	public FormTemplate getTemplate() {
		return delegetee.getTemplate();
	}

}
