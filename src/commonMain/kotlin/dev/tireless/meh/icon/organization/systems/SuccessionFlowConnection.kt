// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SuccessionFlowConnection: ImageVector
  get() {
    val current = _successionFlowConnection
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SuccessionFlowConnection",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M7 3 v2 H2 V3z m6 13 h2 v-5 h-2z m2 -11 a2 2 0 0 0 -2 -2 H9 v2 h4 v4 h2z m4 17 h-4 v-4 h-2 v4 a2 2 0 0 0 2 2 h4z m11.6 .2 -8 -6 A1 1 0 0 0 21 17 v12 a1 1 0 0 0 1.6 .8 l8 -6 a1 1 0 0 0 0 -1.6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 3
          moveTo(x = 7.0f, y = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // V 3z
          verticalLineTo(y = 3.0f)
          close()
          // m 6 13
          moveToRelative(dx = 6.0f, dy = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m 2 -11
          moveToRelative(dx = 2.0f, dy = -11.0f)
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
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 4 17
          moveToRelative(dx = 4.0f, dy = 17.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 11.6 0.2
          moveToRelative(dx = 11.6f, dy = 0.2f)
          // l -8 -6
          lineToRelative(dx = -8.0f, dy = -6.0f)
          // A 1 1 0 0 0 21 17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 17.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 1 1 0 0 0 1.6 0.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.6f,
            dy1 = 0.8f,
          )
          // l 8 -6
          lineToRelative(dx = 8.0f, dy = -6.0f)
          // a 1 1 0 0 0 0 -1.6
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.6f,
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
      .also { _successionFlowConnection = it }
  }

@Suppress("ObjectPropertyName")
private var _successionFlowConnection: ImageVector? = null
