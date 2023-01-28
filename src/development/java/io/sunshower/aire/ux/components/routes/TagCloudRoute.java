package io.sunshower.aire.ux.components.routes;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.RouteScope;
import io.sunshower.aire.ux.components.TagCloud;

@RouteScope
@Route("aire-tag-cloud")
public class TagCloudRoute extends VerticalLayout {

  public TagCloudRoute() {
    add(new TagCloud());
  }
}
