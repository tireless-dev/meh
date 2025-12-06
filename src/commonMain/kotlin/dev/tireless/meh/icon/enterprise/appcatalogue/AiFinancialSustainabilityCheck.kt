// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AiFinancialSustainabilityCheck: ImageVector
  get() {
    val current = _aiFinancialSustainabilityCheck
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AiFinancialSustainabilityCheck",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 23.4142 11.293 18.7072 12.707 17.2928 16.0 20.5858 27.293 9.2928 28.707 10.7072 16.0 23.4142" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 16 23.4142
          moveTo(x = 16.0f, y = 23.4142f)
          // L 11.293 18.7072
          lineTo(x = 11.293f, y = 18.7072f)
          // L 12.707 17.2928
          lineTo(x = 12.707f, y = 17.2928f)
          // L 16 20.5858
          lineTo(x = 16.0f, y = 20.5858f)
          // L 27.293 9.2928
          lineTo(x = 27.293f, y = 9.2928f)
          // L 28.707 10.7072
          lineTo(x = 28.707f, y = 10.7072f)
          // L 16 23.4142z
          lineTo(x = 16.0f, y = 23.4142f)
          close()
        }
        // m12.7 8.7 -1.4 -1.4 L7 11.58 4.41 9 l4.3 -4.3 -1.42 -1.4 -5 5 a1 1 0 0 0 0 1.4 l7 7 1.42 -1.4 L8.4 13z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.7 8.7
          moveTo(x = 12.7f, y = 8.7f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // L 7 11.58
          lineTo(x = 7.0f, y = 11.58f)
          // L 4.41 9
          lineTo(x = 4.41f, y = 9.0f)
          // l 4.3 -4.3
          lineToRelative(dx = 4.3f, dy = -4.3f)
          // l -1.42 -1.4
          lineToRelative(dx = -1.42f, dy = -1.4f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // a 1 1 0 0 0 0 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.4f,
          )
          // l 7 7
          lineToRelative(dx = 7.0f, dy = 7.0f)
          // l 1.42 -1.4
          lineToRelative(dx = 1.42f, dy = -1.4f)
          // L 8.4 13z
          lineTo(x = 8.4f, y = 13.0f)
          close()
        }
        // M16 30 C8.28 30 2 23.72 2 16 h2 a12.01 12.01 0 0 0 24 0 h2 c0 7.72 -6.28 14 -14 14 m8.3 -22.66 a12 12 0 0 0 -11.07 -3.02 l-.46 -1.95 A14 14 0 0 1 25.69 5.9z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // C 8.28 30 2 23.72 2 16
          curveTo(
            x1 = 8.28f,
            y1 = 30.0f,
            x2 = 2.0f,
            y2 = 23.72f,
            x3 = 2.0f,
            y3 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 12.01 12.01 0 0 0 24 0
          arcToRelative(
            a = 12.01f,
            b = 12.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 24.0f,
            dy1 = 0.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // c 0 7.72 -6.28 14 -14 14
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 7.72f,
            dx2 = -6.28f,
            dy2 = 14.0f,
            dx3 = -14.0f,
            dy3 = 14.0f,
          )
          // m 8.3 -22.66
          moveToRelative(dx = 8.3f, dy = -22.66f)
          // a 12 12 0 0 0 -11.07 -3.02
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -11.07f,
            dy1 = -3.02f,
          )
          // l -0.46 -1.95
          lineToRelative(dx = -0.46f, dy = -1.95f)
          // A 14 14 0 0 1 25.69 5.9z
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.69f,
            y1 = 5.9f,
          )
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
      .also { _aiFinancialSustainabilityCheck = it }
  }

@Suppress("ObjectPropertyName")
private var _aiFinancialSustainabilityCheck: ImageVector? = null
