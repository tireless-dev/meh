// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Paragraph: ImageVector
  get() {
    val current = _paragraph
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Paragraph",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 4 H13 a7 7 0 0 0 0 14 v10 h2 V6 h5 v22 h2 V6 h5Z M13 16 a5 5 0 0 1 0 -10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 4
          moveTo(x = 27.0f, y = 4.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // a 7 7 0 0 0 0 14
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 14.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 22
          verticalLineToRelative(dy = 22.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
          close()
          // M 13 16
          moveTo(x = 13.0f, y = 16.0f)
          // a 5 5 0 0 1 0 -10z
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -10.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _paragraph = it }
  }

@Suppress("ObjectPropertyName")
private var _paragraph: ImageVector? = null
