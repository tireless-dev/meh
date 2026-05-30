// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CommitAlt: ImageVector
  get() {
    val current = _commitAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CommitAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17 30 v-8.09 a6 6 0 0 0 0 -11.82 V2 h-2 v8.09 a6 6 0 0 0 0 11.82 V30z m-5 -14 a4 4 0 1 1 8 0 4 4 0 0 1 -8 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 30
          moveTo(x = 17.0f, y = 30.0f)
          // v -8.09
          verticalLineToRelative(dy = -8.09f)
          // a 6 6 0 0 0 0 -11.82
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -11.82f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 8.09
          verticalLineToRelative(dy = 8.09f)
          // a 6 6 0 0 0 0 11.82
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 11.82f,
          )
          // V 30z
          verticalLineTo(y = 30.0f)
          close()
          // m -5 -14
          moveToRelative(dx = -5.0f, dy = -14.0f)
          // a 4 4 0 1 1 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // a 4 4 0 0 1 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
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
      .also { _commitAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _commitAlt: ImageVector? = null
