package com.github.mitrakumarsujan.formmodel.model.form;

import java.util.List;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-24
 */
public interface ChoiceBasedFormField extends FormField {
	List<? extends OptionField> getOptions();
}
