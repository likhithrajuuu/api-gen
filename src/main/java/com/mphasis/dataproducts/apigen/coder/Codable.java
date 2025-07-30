package com.mphasis.dataproducts.apigen.coder;

import com.mphasis.dataproducts.apigen.configs.ApiConfigModel;

public interface Codable {
	public String toCode(ApiConfigModel configuration) throws CoderException;
}
