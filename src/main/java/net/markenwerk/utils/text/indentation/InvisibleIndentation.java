/*
 * Copyright (c) 2016 Torsten Krause, Markenwerk GmbH
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.markenwerk.utils.text.indentation;

import java.io.IOException;

/**
 * A {@link InvisibleIndentation} is an {@link Indentation} that has no visible
 * effect.
 * 
 * @author Torsten Krause (tk at markenwerk dot net)
 * @since 1.0.0
 */
public class InvisibleIndentation implements Indentation {

	private final LineBreak lineBreak;

	/**
	 * Creates a new {@link InvisibleIndentation} using the
	 * {@link LineBreak#NONE} {@link LineBreak}.
	 */
	public InvisibleIndentation() {
		this(LineBreak.NONE);
	}

	/**
	 * Creates a new {@link InvisibleIndentation}.
	 * 
	 * @param lineBreak
	 *            The {@link LineBreak} to be used.
	 * 
	 * @throws IllegalArgumentException
	 *             If the given {@link LineBreak} is {@literal null}.
	 */
	public InvisibleIndentation(LineBreak lineBreak) throws IllegalArgumentException {
		if (null == lineBreak) {
			throw new IllegalArgumentException("The given line break is null");
		}
		this.lineBreak = lineBreak;
	}

	@Override
	public boolean isVisible() {
		return false;
	}

	@Override
	public String getLineBreak() {
		return lineBreak.getLineBreakString();
	}

	@Override
	public String get(int level) throws IllegalArgumentException {
		return "";
	}

	@Override
	public String get(int level, boolean includeLineBreak) throws IllegalArgumentException {
		return "";
	}

	@Override
	public void appendTo(Appendable appendable, int level) throws IllegalArgumentException, IOException {
		appendTo(appendable, level, false);
	}

	@Override
	public void appendTo(Appendable appendable, int level, boolean includeLineBreak) throws IllegalArgumentException,
			IOException {
		if (null == appendable) {
			throw new IllegalArgumentException("The given appendable is null");
		}
	}

}
