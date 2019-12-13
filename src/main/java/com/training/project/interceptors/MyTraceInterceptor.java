package com.training.project.interceptors;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.CustomizableTraceInterceptor;
import org.springframework.lang.Nullable;

public class MyTraceInterceptor extends CustomizableTraceInterceptor{
	
	Logger logger = LoggerFactory.getLogger(MyTraceInterceptor.class);
	
	
	/**
	 * Write the supplied trace message and {@link Throwable} to the
	 * supplied {@code Log} instance.
	 * <p>To be called by {@link #invokeUnderTrace} for enter/exit outcomes,
	 * potentially including an exception. Note that an exception's stack trace
	 * won't get logged when {@link #setLogExceptionStackTrace} is "false".
	 * <p>By default messages are written at {@code TRACE} level. Subclasses
	 * can override this method to control which level the message is written
	 * at, typically also overriding {@link #isLogEnabled} accordingly.
	 * @since 4.3.10
	 * @see #setLogExceptionStackTrace
	 * @see #isLogEnabled
	 */
	protected void writeToLog(Log logger, String message, @Nullable Throwable ex) {
		if (ex != null ) {
			logger.info(message, ex);
		}
		else {
			logger.info(message);
		}
	}
	
	/**
	 * Determine whether the interceptor should kick in, that is,
	 * whether the {@code invokeUnderTrace} method should be called.
	 * <p>Default behavior is to check whether the given {@code Log}
	 * instance is enabled. Subclasses can override this to apply the
	 * interceptor in other cases as well.
	 * @param invocation the {@code MethodInvocation} being traced
	 * @param logger the {@code Log} instance to check
	 * @see #invokeUnderTrace
	 * @see #isLogEnabled
	 */
	protected boolean isInterceptorEnabled(MethodInvocation invocation, Log logger) {
		return true;
	}

}
