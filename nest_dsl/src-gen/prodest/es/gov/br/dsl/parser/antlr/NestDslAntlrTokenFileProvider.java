/*
 * generated by XText 2.18.0.M3
 */
package prodest.es.gov.br.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class NestDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("prodest/es/gov/br/dsl/parser/antlr/internal/InternalNestDsl.tokens");
	}
}
