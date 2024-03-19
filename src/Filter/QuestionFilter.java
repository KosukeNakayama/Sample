package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns={"/kouka/*"})
public class QuestionFilter implements Filter {

	public void doFilter(
		ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {


		System.out.println("フィルタの処理①");
		chain.doFilter(request, response);
		System.out.println("フィルタの処理②");
	}

	public void init(FilterConfig filterConfig) {}
	public void destroy() {}
}
