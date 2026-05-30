// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentRequirements: ImageVector
  get() {
    val current = _documentRequirements
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentRequirements",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="28.5899 20.59 22.0 27.1798 19.41 24.5898 18.0 26.0 22.0 30.0 30.0 22.0 28.5899 20.59" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 28.5899 20.59
          moveTo(x = 28.5899f, y = 20.59f)
          // L 22 27.1798
          lineTo(x = 22.0f, y = 27.1798f)
          // L 19.41 24.5898
          lineTo(x = 19.41f, y = 24.5898f)
          // L 18 26
          lineTo(x = 18.0f, y = 26.0f)
          // L 22 30
          lineTo(x = 22.0f, y = 30.0f)
          // L 30 22
          lineTo(x = 30.0f, y = 22.0f)
          // L 28.5899 20.59z
          lineTo(x = 28.5899f, y = 20.59f)
          close()
        }
        // <rect width="6" height="2" x="10.0" y="20.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 10 20
          moveTo(x = 10.0f, y = 20.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="8" height="2" x="10.0" y="16.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 10 16
          moveTo(x = 10.0f, y = 16.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // M8 4 h8 v6 a2 2 0 0 0 2 2 h6 v6 h2 v-8 c0 -.3 -.1 -.5 -.3 -.7 l-7 -7 A1 1 0 0 0 18 2 H8 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h7 v-2 H8z m10 .4 5.6 5.6 H18z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 4
          moveTo(x = 8.0f, y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // c 0 -0.3 -0.1 -0.5 -0.3 -0.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.3f,
            dx2 = -0.1f,
            dy2 = -0.5f,
            dx3 = -0.3f,
            dy3 = -0.7f,
          )
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // A 1 1 0 0 0 18 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 2.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // m 10 0.4
          moveToRelative(dx = 10.0f, dy = 0.4f)
          // l 5.6 5.6
          lineToRelative(dx = 5.6f, dy = 5.6f)
          // H 18z
          horizontalLineTo(x = 18.0f)
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
      .also { _documentRequirements = it }
  }

@Suppress("ObjectPropertyName")
private var _documentRequirements: ImageVector? = null
