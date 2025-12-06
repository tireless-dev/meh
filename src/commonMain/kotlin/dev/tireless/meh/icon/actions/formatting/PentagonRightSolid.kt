// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PentagonRightSolid: ImageVector
  get() {
    val current = _pentagonRightSolid
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PentagonRightSolid",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 16 a1 1 0 0 0 -.2 -.6 l-9.54 -13 a1 1 0 0 0 -1.11 -.35 L3.69 7.02 A1 1 0 0 0 3 7.97 v16.06 a1 1 0 0 0 .7 .95 l15.45 4.97 a1 1 0 0 0 1.11 -.36 l9.55 -13 A1 1 0 0 0 30 16
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 16
          moveTo(x = 30.0f, y = 16.0f)
          // a 1 1 0 0 0 -0.2 -0.6
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = -0.6f,
          )
          // l -9.54 -13
          lineToRelative(dx = -9.54f, dy = -13.0f)
          // a 1 1 0 0 0 -1.11 -0.35
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.11f,
            dy1 = -0.35f,
          )
          // L 3.69 7.02
          lineTo(x = 3.69f, y = 7.02f)
          // A 1 1 0 0 0 3 7.97
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.0f,
            y1 = 7.97f,
          )
          // v 16.06
          verticalLineToRelative(dy = 16.06f)
          // a 1 1 0 0 0 0.7 0.95
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.7f,
            dy1 = 0.95f,
          )
          // l 15.45 4.97
          lineToRelative(dx = 15.45f, dy = 4.97f)
          // a 1 1 0 0 0 1.11 -0.36
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.11f,
            dy1 = -0.36f,
          )
          // l 9.55 -13
          lineToRelative(dx = 9.55f, dy = -13.0f)
          // A 1 1 0 0 0 30 16
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 16.0f,
          )
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
      .also { _pentagonRightSolid = it }
  }

@Suppress("ObjectPropertyName")
private var _pentagonRightSolid: ImageVector? = null
