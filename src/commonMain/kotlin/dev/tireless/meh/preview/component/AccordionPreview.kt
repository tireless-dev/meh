// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Accordion
import dev.tireless.meh.component.AccordionItem
import dev.tireless.meh.component.Text
import dev.tireless.meh.theme.MehTheme

@Composable
fun AccordionPreview() {
  MehTheme {
    Accordion(modifier = Modifier.padding(16.dp)) {
      AccordionItem(title = "Section 1", initiallyExpanded = true) {
        Text("Content for section 1. This is where the details go.")
      }
      AccordionItem(title = "Section 2") {
        Text("Content for section 2.")
      }
      AccordionItem(title = "Section 3") {
        Text("Content for section 3.")
      }
    }
  }
}
