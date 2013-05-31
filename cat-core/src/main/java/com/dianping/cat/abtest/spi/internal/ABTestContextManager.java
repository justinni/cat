package com.dianping.cat.abtest.spi.internal;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dianping.cat.abtest.ABTestId;
import com.dianping.cat.abtest.spi.ABTestContext;

public interface ABTestContextManager {
	public ABTestContext getContext(ABTestId testId);

	public List<ABTestContext> getContexts();

	public void onRequestBegin(HttpServletRequest req);

	public void onRequestEnd();
}