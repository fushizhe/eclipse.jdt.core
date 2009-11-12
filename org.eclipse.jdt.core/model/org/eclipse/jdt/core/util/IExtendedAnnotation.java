/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.core.util;

/**
 * Description of an extended annotation structure as described in the JVM specifications
 * (added in JavaSE-1.7).
 *
 * This interface may be implemented by clients.
 *
 * @since 3.6
 */
public interface IExtendedAnnotation extends IAnnotation {
	/**
	 * Answer back the target type as described in the JVM specifications.
	 *
	 * @return the target type
	 */
	int getTargetType();
	
	/**
	 * Answer back the offset.
	 * 
	 * <p>The offset within the bytecodes of the containing method of the <code>checkcast</code> 
	 * bytecode emitted for a typecast, the <code>instanceof</code> bytecode for the type tests, 
	 * the <code>new</code> bytecode emitted for the object creation expression, the <code>ldc(_w)</code>
	 * bytecode emitted for class literal, or the <code>getstatic</code> bytecode emitted for primitive
	 * class literals.</p>
	 * 
	 * @return the offset
	 */
	int getOffset();
	
	/**
	 * Answer back the local variable reference info table length of this entry as specified in
	 * the JVM specifications.
	 * 
	 * <p>This is defined only for annotations related a local variable.</p>
	 *
	 * @return the local variable reference info table length of this entry as specified in
	 * the JVM specifications
	 */
	int getLocalVariableRefenceInfoLength();
	
	/**
	 * Answer back the local variable reference info table of this entry as specified in
	 * the JVM specifications. Answer an empty array if none.
	 * 
	 * <p>This is defined only for annotations related a local variable.</p>
	 *
	 * @return the local variable reference info table of this entry as specified in
	 * the JVM specifications. Answer an empty array if none
	 */
	ILocalVariableReferenceInfo[] getLocalVariableTable();
	
	/**
	 * Answer back the method parameter index.
	 * 
	 * <p>The index is 0-based.</p>
	 * 
	 * @return the method parameter index
	 */
	int getParameterIndex();

	/**
	 * Answer back the method type parameter index.
	 * 
	 * <p>The index is 0-based.</p>
	 * 
	 * @return the method type parameter index
	 */
	int getTypeParameterIndex();

	/**
	 * Answer back the method type parameter bound index.
	 * 
	 * <p>The index is 0-based.</p>
	 * 
	 * @return the method type parameter bound index
	 */
	int getTypeParameterBoundIndex();
}