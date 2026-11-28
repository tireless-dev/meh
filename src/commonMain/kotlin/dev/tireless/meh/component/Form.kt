// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.tireless.meh.theme.MehTheme

/**
 * Carbon Design System v11 Form container organizing form fields with `$spacing-06` vertical
 * spacing.
 */
@Composable
fun Form(
  modifier: Modifier = Modifier,
  title: String? = null,
  description: String? = null,
  content: @Composable ColumnScope.() -> Unit,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
  ) {
    if (title != null || description != null) {
      Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
        if (title != null) {
          BasicText(
            text = title,
            style = typography.heading03.copy(color = colors.textPrimary),
          )
        }
        if (description != null) {
          BasicText(
            text = description,
            style = typography.body01.copy(color = colors.textSecondary),
          )
        }
      }
    }
    content()
  }
}

/**
 * Carbon Design System v11 FormGroup (fieldset) with legend text, grouped controls, and optional
 * group-level helper message.
 */
@Composable
fun FormGroup(
  legend: String,
  modifier: Modifier = Modifier,
  message: String? = null,
  content: @Composable ColumnScope.() -> Unit,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
  ) {
    BasicText(
      text = legend,
      style = typography.label01.copy(color = colors.textSecondary),
    )
    content()
    if (message != null) {
      BasicText(
        text = message,
        style = typography.label01.copy(color = colors.textHelper),
      )
    }
  }
}

@Composable
fun FormItem(
  modifier: Modifier = Modifier,
  content: @Composable ColumnScope.() -> Unit,
) {
  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03),
  ) {
    content()
  }
}

@Composable
fun FormButtonGroup(
  modifier: Modifier = Modifier,
  content: @Composable RowScope.() -> Unit,
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .padding(top = MehTheme.spacing.spacing03),
    horizontalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing05),
  ) {
    content()
  }
}
