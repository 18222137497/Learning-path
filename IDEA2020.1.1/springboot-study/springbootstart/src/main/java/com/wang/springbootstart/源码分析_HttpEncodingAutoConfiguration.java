package com.wang.springbootstart;
/**
-----表示这是一个配置类
@Configuration(proxyBeanMethods = false)
-----自动配置属性：HttpProperties
@EnableConfigurationProperties(ServerProperties.class)
-----Spring底层注解：根据不同的条件，来判断当前配置活着类是否生效
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@ConditionalOnClass(CharacterEncodingFilter.class)
@ConditionalOnProperty(prefix = "server.servlet.encoding", value = "enabled", matchIfMissing = true)
 */
public class 源码分析_HttpEncodingAutoConfiguration {

//    private final Encoding properties;
//
//    public HttpEncodingAutoConfiguration(ServerProperties properties) {
//        this.properties = properties.getServlet().getEncoding();
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public CharacterEncodingFilter characterEncodingFilter() {
//        CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
//        filter.setEncoding(this.properties.getCharset().name());
//        filter.setForceRequestEncoding(this.properties.shouldForce(Encoding.Type.REQUEST));
//        filter.setForceResponseEncoding(this.properties.shouldForce(Encoding.Type.RESPONSE));
//        return filter;
//    }
//
//    @Bean
//    public LocaleCharsetMappingsCustomizer localeCharsetMappingsCustomizer() {
//        return new LocaleCharsetMappingsCustomizer(this.properties);
//    }
//
//    static class LocaleCharsetMappingsCustomizer
//            implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>, Ordered {
//
//        private final Encoding properties;
//
//        LocaleCharsetMappingsCustomizer(Encoding properties) {
//            this.properties = properties;
//        }
//
//        @Override
//        public void customize(ConfigurableServletWebServerFactory factory) {
//            if (this.properties.getMapping() != null) {
//                factory.setLocaleCharsetMappings(this.properties.getMapping());
//            }
//        }
//
//        @Override
//        public int getOrder() {
//            return 0;
//        }
//
//    }

}
