package com.gome.arch.utils;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResourceUtil {

	/**
	 * 从指定的问题路径加载配置文件
	 * @param locations
	 * @return
	 */

	public static Resource[] resolveLocationsToResource(String[] locations) {
		ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
		List<Resource> resources = new ArrayList<Resource>();
		
		if (locations != null) {
			for (String location : locations) {
				try {
					Resource[] mappers = resourceResolver.getResources(location);
					resources.addAll(Arrays.asList(mappers));
				} catch (IOException e) {
					// ignore
				}
			}
		}
		return resources.toArray(new Resource[resources.size()]);
	}
}