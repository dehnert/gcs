/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is GURPS Character Sheet.
 *
 * The Initial Developer of the Original Code is Richard A. Wilkes.
 * Portions created by the Initial Developer are Copyright (C) 1998-2013 the
 * Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 * ***** END LICENSE BLOCK ***** */

package com.trollworks.gcs.equipment;

import com.trollworks.gcs.feature.Feature;
import com.trollworks.ttk.annotation.LS;
import com.trollworks.ttk.annotation.Localized;

@Localized({
				@LS(key = "EQUIPPED", msg = "Equipped"),
				@LS(key = "CARRIED", msg = "Carried"),
				@LS(key = "NOT_CARRIED", msg = "Not Carried"),
})
/** The possible states for a piece of equipment. */
public enum EquipmentState {
	/**
	 * The state for a piece of equipment that is being carried and should also have any of its
	 * {@link Feature}s applied. For example, a magic ring that is being worn on a finger.
	 */
	EQUIPPED("E"), //$NON-NLS-1$
	/**
	 * The state for a piece of equipment that is being carried, but should not have any of its
	 * {@link Feature}s applied. For example, a magic ring that is being stored in a pouch.
	 */
	CARRIED("C"), //$NON-NLS-1$
	/** The state of a piece of equipment that is not being carried. */
	NOT_CARRIED("-"); //$NON-NLS-1$

	private String	mShortName;

	private EquipmentState(String shortName) {
		mShortName = shortName;
	}

	@Override
	public String toString() {
		return EquipmentState_LS.toString(this);
	}

	/** @return The short form of its description, typically a single character. */
	public String toShortName() {
		return mShortName;
	}
}