package com.apigen.dataproducts.apigen.coder;

import com.apigen.dataproducts.apigen.configs.ApiConfigModel;

public interface Codable {
	public String toCode(ApiConfigModel configuration) throws CoderException;
}
