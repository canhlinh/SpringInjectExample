package com.kipalog;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class TextEditor {
	@Inject
	private SpellChecker spellChecker;
	
   public void spellCheck() {
	   spellChecker.checkSpelling();
   }
}
