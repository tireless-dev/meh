// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningOther: ImageVector
  get() {
    val current = _warningOther
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WarningOther",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="12" height="2" x="18.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 20
          moveTo(x = 18.0f, y = 20.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 24
          moveTo(x = 18.0f, y = 24.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 28
          moveTo(x = 18.0f, y = 28.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // M14 18 a1.5 1.5 0 1 0 1.5 1.5 A1.5 1.5 0 0 0 14 18
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 18
          moveTo(x = 14.0f, y = 18.0f)
          // a 1.5 1.5 0 1 0 1.5 1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.5f,
            dy1 = 1.5f,
          )
          // A 1.5 1.5 0 0 0 14 18
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 18.0f,
          )
        }
        // <rect width="2" height="9" x="13.0" y="7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 7
          moveTo(x = 13.0f, y = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M14 4 a10 10 0 0 1 10 10 h2 a12 12 0 1 0 -12 12 v-2 a10 10 0 0 1 0 -20
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 4
          moveTo(x = 14.0f, y = 4.0f)
          // a 10 10 0 0 1 10 10
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.0f,
            dy1 = 10.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 12 12 0 1 0 -12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -12.0f,
            dy1 = 12.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 10 10 0 0 1 0 -20
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -20.0f,
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
      .also { _warningOther = it }
  }

@Suppress("ObjectPropertyName")
private var _warningOther: ImageVector? = null
