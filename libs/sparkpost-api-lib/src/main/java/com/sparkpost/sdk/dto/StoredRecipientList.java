/* Copyright 2014 Message Systems, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this software except in compliance with the License.
 *
 * A copy of the License is located at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0.html
 *
 * or in the "license" file accompanying this software. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */

package com.sparkpost.sdk.dto;

import com.google.gson.annotations.SerializedName;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * This is used when specifying a stored recipient list in the transmission.
 * Note that this attribute should not be present when specifying recipients
 * inline.
 *
 * @author grava
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoredRecipientList extends Base {

	/**
	 * Identifier of the stored recipient list to use
	 * 
	 * Specify this field when using a stored recipient list.
	 */
	@SerializedName("list_id")
	private String listId = null;

}
