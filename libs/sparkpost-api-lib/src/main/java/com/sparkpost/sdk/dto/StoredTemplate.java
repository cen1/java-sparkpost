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
 * DTO for storing a stored template.
 *
 * @author grava
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoredTemplate extends Base {

	/**
	 * ID of the stored template to use
	 * 
	 * Specify this field when using a stored template. Maximum length -- 64
	 * bytes
	 */
	@SerializedName("template_id")
	private String templateId;

	/**
	 * Whether or not to use a draft template
	 * 
	 * If this field is set to true and no draft template exists, the
	 * transmission will fail.
	 */
	@SerializedName("use_draft_template")
	private Boolean useDraftTemplate;
}
