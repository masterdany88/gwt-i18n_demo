package com.example.mytestproject.client.ui.login.shell;

import com.example.mytestproject.client.MyTestProjectContext;
import com.example.mytestproject.client.Translations;
import com.github.nalukit.nalu.client.component.AbstractShell;
import com.github.nalukit.nalu.client.component.annotation.Shell;
import com.google.gwt.core.client.GWT;
import elemental2.dom.CSSProperties;
import java.lang.Override;
import org.dominokit.domino.ui.layout.Layout;
import org.dominokit.domino.ui.style.ColorScheme;

/**
 * Copyright (C) 2018 - 2019 Frank Hossfeld <frank.hossfeld@googlemail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@Shell("login")
public class LoginShell extends AbstractShell<MyTestProjectContext> {
  private Layout layout;

  public LoginShell() {
    super();
  }

  @Override
  public void attachShell() {

    Translations constants = GWT.create(Translations.class);
    layout = Layout.create(constants.appTitle() + " Nalu - Simple Application using Domino-UI - Login")
                                  .show(ColorScheme.INDIGO);
    layout.showFooter()
                  .fixFooter()
                  .getFooter()
                  .element().style.minHeight = CSSProperties.MinHeightUnionType.of("42px");
    layout.getFooter().setId("footer");
    layout.disableLeftPanel();
    layout.getContentPanel().setId("content");
  }

  @Override
  public void detachShell() {
    this.layout.remove();
  }
}
