// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RuleFilled: ImageVector
  get() {
    val current = _ruleFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RuleFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="14" height="2" x="9.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 9 16
          moveTo(x = 9.0f, y = 16.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <rect width="14" height="2" x="9.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 9 10
          moveTo(x = 9.0f, y = 10.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // M26 2 H6 a2 2 0 0 0 -2 2 v13 a11 11 0 0 0 5.82 9.7 L16 30 l6.18 -3.3 A11 11 0 0 0 28 17 V4 a2 2 0 0 0 -2 -2 m-3 16 H9 v-2 h14Z m0 -6 H9 v-2 h14Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 2
          moveTo(x = 26.0f, y = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // a 11 11 0 0 0 5.82 9.7
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.82f,
            dy1 = 9.7f,
          )
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // l 6.18 -3.3
          lineToRelative(dx = 6.18f, dy = -3.3f)
          // A 11 11 0 0 0 28 17
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 17.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -3 16
          moveToRelative(dx = -3.0f, dy = 16.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 14z
          horizontalLineToRelative(dx = 14.0f)
          close()
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 14z
          horizontalLineToRelative(dx = 14.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _ruleFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _ruleFilled: ImageVector? = null
