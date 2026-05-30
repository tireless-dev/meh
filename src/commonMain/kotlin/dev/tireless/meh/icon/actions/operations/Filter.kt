// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Filter: ImageVector
  get() {
    val current = _filter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Filter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18 28 h-4 a2 2 0 0 1 -2 -2 v-7.59 L4.59 11 A2 2 0 0 1 4 9.59 V6 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v3.59 A2 2 0 0 1 27.41 11 L20 18.41 V26 a2 2 0 0 1 -2 2 M6 6 v3.59 l8 8 V26 h4 v-8.41 l8 -8 V6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 28
          moveTo(x = 18.0f, y = 28.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -7.59
          verticalLineToRelative(dy = -7.59f)
          // L 4.59 11
          lineTo(x = 4.59f, y = 11.0f)
          // A 2 2 0 0 1 4 9.59
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 9.59f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 3.59
          verticalLineToRelative(dy = 3.59f)
          // A 2 2 0 0 1 27.41 11
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.41f,
            y1 = 11.0f,
          )
          // L 20 18.41
          lineTo(x = 20.0f, y = 18.41f)
          // V 26
          verticalLineTo(y = 26.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // v 3.59
          verticalLineToRelative(dy = 3.59f)
          // l 8 8
          lineToRelative(dx = 8.0f, dy = 8.0f)
          // V 26
          verticalLineTo(y = 26.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -8.41
          verticalLineToRelative(dy = -8.41f)
          // l 8 -8
          lineToRelative(dx = 8.0f, dy = -8.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
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
      .also { _filter = it }
  }

@Suppress("ObjectPropertyName")
private var _filter: ImageVector? = null
