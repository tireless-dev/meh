// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wheat: ImageVector
  get() {
    val current = _wheat
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Wheat",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 3 v2.59 l-4 4 V1 h-2 v8.59 l-4 -4 V3 H9 v16 a7 7 0 0 0 6 6.92 V30 h2 v-4.08 A7 7 0 0 0 23 19 V3Z m-6 20.9 a5 5 0 0 1 -4 -4.9 v-2.59 l4 4Z m0 -6.31 -4 -4 V8.4 l4 4Z m2 -5.18 4 -4 v5.18 l-4 4Z m0 11.49 V20.4 l4 -4 V19 a5 5 0 0 1 -4 4.9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 3
          moveTo(x = 21.0f, y = 3.0f)
          // v 2.59
          verticalLineToRelative(dy = 2.59f)
          // l -4 4
          lineToRelative(dx = -4.0f, dy = 4.0f)
          // V 1
          verticalLineTo(y = 1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 8.59
          verticalLineToRelative(dy = 8.59f)
          // l -4 -4
          lineToRelative(dx = -4.0f, dy = -4.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // a 7 7 0 0 0 6 6.92
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.92f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4.08
          verticalLineToRelative(dy = -4.08f)
          // A 7 7 0 0 0 23 19
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 19.0f,
          )
          // V 3z
          verticalLineTo(y = 3.0f)
          close()
          // m -6 20.9
          moveToRelative(dx = -6.0f, dy = 20.9f)
          // a 5 5 0 0 1 -4 -4.9
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.9f,
          )
          // v -2.59
          verticalLineToRelative(dy = -2.59f)
          // l 4 4z
          lineToRelative(dx = 4.0f, dy = 4.0f)
          close()
          // m 0 -6.31
          moveToRelative(dx = 0.0f, dy = -6.31f)
          // l -4 -4
          lineToRelative(dx = -4.0f, dy = -4.0f)
          // V 8.4
          verticalLineTo(y = 8.4f)
          // l 4 4z
          lineToRelative(dx = 4.0f, dy = 4.0f)
          close()
          // m 2 -5.18
          moveToRelative(dx = 2.0f, dy = -5.18f)
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // v 5.18
          verticalLineToRelative(dy = 5.18f)
          // l -4 4z
          lineToRelative(dx = -4.0f, dy = 4.0f)
          close()
          // m 0 11.49
          moveToRelative(dx = 0.0f, dy = 11.49f)
          // V 20.4
          verticalLineTo(y = 20.4f)
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // V 19
          verticalLineTo(y = 19.0f)
          // a 5 5 0 0 1 -4 4.9
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.9f,
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
      .also { _wheat = it }
  }

@Suppress("ObjectPropertyName")
private var _wheat: ImageVector? = null
