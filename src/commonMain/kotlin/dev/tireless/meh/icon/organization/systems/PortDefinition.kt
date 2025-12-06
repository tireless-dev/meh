// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PortDefinition: ImageVector
  get() {
    val current = _portDefinition
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PortDefinition",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 7 V3.6 A1.6 1.6 0 0 0 17.4 2 H4 v2 h13 v3 h-6 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h6 v3 H4 v2 h13.4 a1.6 1.6 0 0 0 1.6 -1.6 V25 h6 a2 2 0 0 0 2 -2 V9 a2 2 0 0 0 -2 -2z m6 16 H11 V9 h14z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 7
          moveTo(x = 19.0f, y = 7.0f)
          // V 3.6
          verticalLineTo(y = 3.6f)
          // A 1.6 1.6 0 0 0 17.4 2
          arcTo(
            horizontalEllipseRadius = 1.6f,
            verticalEllipseRadius = 1.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.4f,
            y1 = 2.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
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
          // v 14
          verticalLineToRelative(dy = 14.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 13.4
          horizontalLineToRelative(dx = 13.4f)
          // a 1.6 1.6 0 0 0 1.6 -1.6
          arcToRelative(
            a = 1.6f,
            b = 1.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.6f,
            dy1 = -1.6f,
          )
          // V 25
          verticalLineTo(y = 25.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
          // a 2 2 0 0 0 -2 -2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          close()
          // m 6 16
          moveToRelative(dx = 6.0f, dy = 16.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 14z
          horizontalLineToRelative(dx = 14.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _portDefinition = it }
  }

@Suppress("ObjectPropertyName")
private var _portDefinition: ImageVector? = null
