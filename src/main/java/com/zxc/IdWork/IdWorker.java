package com.zxc.IdWork;

import java.util.UUID;

/**
 * @program: IdWork
 *
 * @description: 自增长接口
 *
 * @author: Mr.Zhu
 *
 * @create: 2019-07-30 14:07
 **/
public class IdWorker {
	private static final IdWork idworker = new IdWork();

	public IdWorker() {
	}

	public static long getId() {
		return idworker.nextId();
	}

	public static synchronized String get32UUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
