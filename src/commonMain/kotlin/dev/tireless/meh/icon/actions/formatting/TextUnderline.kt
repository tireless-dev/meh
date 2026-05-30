// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextUnderline: ImageVector
  get() {
    val current = _textUnderline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextUnderline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="24" height="2" x="4.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 26
          moveTo(x = 4.0f, y = 26.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -24z
          horizontalLineToRelative(dx = -24.0f)
          close()
        }
        // M16 23 a7 7 0 0 1 -7 -7 V5 h2 v11 a5 5 0 0 0 10 0 V5 h2 v11 a7 7 0 0 1 -7 7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 23
          moveTo(x = 16.0f, y = 23.0f)
          // a 7 7 0 0 1 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          // V 5
          verticalLineTo(y = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // a 5 5 0 0 0 10 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 10.0f,
            dy1 = 0.0f,
          )
          // V 5
          verticalLineTo(y = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // a 7 7 0 0 1 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
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
      .also { _textUnderline = it }
  }

@Suppress("ObjectPropertyName")
private var _textUnderline: ImageVector? = null
