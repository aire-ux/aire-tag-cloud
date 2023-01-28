package io.sunshower.aire.ux.components;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;

@Tag("aire-tag-cloud")
@JsModule(Paths.TagCloud_SOURCE)
@CssImport(Paths.TagCloud_STYLES)
// @JsModule("@aire-ux/aire-tag-cloud/aire-tag-cloud")
// @CssImport("@aire-ux/aire-tag-cloud/styles/aire-tag-cloud.css")

/** uncomment this if you have deployed this component into NPMJS */
// @NpmPackage(value = "@${organzation}/aire-tag-cloud", version = Versions.TagCloud_VERSION)
public class TagCloud extends HtmlContainer {

  public TagCloud() {
    add(new Button("Hello from TagCloud!"));
  }
}
