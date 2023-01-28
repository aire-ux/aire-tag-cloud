import {
  TagCloud
} from "@aire-ux/aire-tag-cloud/aire-tag-cloud";

export default function setup() {


  window.customElements.define(
      'aire-tag-cloud',
      TagCloud
  );
  Object.defineProperty(window.location, 'href', {
    writable: true,
    value: 'https://localhost'
  });
  // (window as any).chai.use(chaiDomDiff);
}
setup();