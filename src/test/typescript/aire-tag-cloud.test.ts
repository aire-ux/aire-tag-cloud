import "./harness";

import {
  fixture,
  expect, nextFrame,
} from "@open-wc/testing";

import {
  beforeEach,
  describe,
  it,
  vi
} from "vitest";
import {
  TagCloud
} from "@aire-ux/aire-tag-cloud/aire-tag-cloud"


import {html} from "lit";


describe('a aire-tag-cloud', async () => {
  let element: TagCloud;
  beforeEach(async () => {
    element = await fixture(html`
      <aire-tag-cloud></aire-tag-cloud>
    `);

    await nextFrame();
  });

  it('should mount the component', () => {
    let elements = document.querySelectorAll('aire-tag-cloud');
    expect(elements.length).to.equal(1);
  });

});