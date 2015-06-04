<#assign c=JspTaglibs["/WEB-INF/tlds/c.tld"] />
<#assign fmt=JspTaglibs["/WEB-INF/tlds/fmt.tld"] />
<#assign fn=JspTaglibs["/WEB-INF/tlds/fn.tld"] />
<#assign form=JspTaglibs["/WEB-INF/tlds/spring-form.tld"] />
<#assign pager=JspTaglibs["/WEB-INF/tlds/pager.tld"] />

<#macro basePath><#if springMacroRequestContext.getContextPath()=="/"><#else>${springMacroRequestContext.getContextPath()}</#if></#macro>
<#global contextPath><@basePath/></#global>
