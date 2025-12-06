// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Subclassification: ImageVector
  get() {
    val current = _subclassification
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Subclassification",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13 28 V18 h7 a1 1 0 0 0 .87 -1.5 l-8 -14 A1 1 0 0 0 12 2 a1 1 0 0 0 -.87 .5 l-8 14 A1 1 0 0 0 4 18 h7 v10 a2 2 0 0 0 2 2 h15 v-2z M5.72 16 12 5.02 18.28 16z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 28
          moveTo(x = 13.0f, y = 28.0f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // a 1 1 0 0 0 0.87 -1.5
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.87f,
            dy1 = -1.5f,
          )
          // l -8 -14
          lineToRelative(dx = -8.0f, dy = -14.0f)
          // A 1 1 0 0 0 12 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 2.0f,
          )
          // a 1 1 0 0 0 -0.87 0.5
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.87f,
            dy1 = 0.5f,
          )
          // l -8 14
          lineToRelative(dx = -8.0f, dy = 14.0f)
          // A 1 1 0 0 0 4 18
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 18.0f,
          )
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 5.72 16
          moveTo(x = 5.72f, y = 16.0f)
          // L 12 5.02
          lineTo(x = 12.0f, y = 5.02f)
          // L 18.28 16z
          lineTo(x = 18.28f, y = 16.0f)
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
      .also { _subclassification = it }
  }

@Suppress("ObjectPropertyName")
private var _subclassification: ImageVector? = null
