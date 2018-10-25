package annotation;

import java.awt.event.ActionListener;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ActionListenerInstaller {
	public static void processAnntations(Object obj) {

	}

	public static void addListener(Object source, final Object param, final Method m) 
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {
		InvocationHandler handler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				return m.invoke(param);
			}
		};
		Object listener = Proxy.newProxyInstance(null, 
			new Class[] { java.awt.event.ActionListener.class }, handler);
		Method adder = source.getClass().getMethod("addActionListener", ActionListener.class);
		adder.invoke(source, listener);
	}
}
