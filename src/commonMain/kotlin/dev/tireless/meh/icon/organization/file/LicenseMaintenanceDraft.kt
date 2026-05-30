// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LicenseMaintenanceDraft: ImageVector
  get() {
    val current = _licenseMaintenanceDraft
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LicenseMaintenanceDraft",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.7 19.3 -3 -3 a1 1 0 0 0 -1.4 0 L16 25.58 V30 h4.41 l9.3 -9.3 a1 1 0 0 0 0 -1.4 M19.6 28 H18 v-1.59 l5 -5 L24.59 23Z M26 21.59 24.41 20 26 18.41 27.59 20Z M20 13 v-2 h-2.14 a4 4 0 0 0 -.43 -1.02 l1.52 -1.52 -1.41 -1.41 -1.52 1.52 A4 4 0 0 0 15 8.14 V6 h-2 v2.14 a4 4 0 0 0 -1.02 .43 l-1.52 -1.52 -1.41 1.41 1.52 1.52 A4 4 0 0 0 10.14 11 H8 v2 h2.14 a4 4 0 0 0 .43 1.02 l-1.52 1.52 1.41 1.41 1.52 -1.52 A4 4 0 0 0 13 15.86 V18 h2 v-2.14 a4 4 0 0 0 1.02 -.43 l1.52 1.52 1.41 -1.41 -1.52 -1.52 A4 4 0 0 0 17.86 13Z m-6 1 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.7 19.3
          moveTo(x = 29.7f, y = 19.3f)
          // l -3 -3
          lineToRelative(dx = -3.0f, dy = -3.0f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // L 16 25.58
          lineTo(x = 16.0f, y = 25.58f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 4.41
          horizontalLineToRelative(dx = 4.41f)
          // l 9.3 -9.3
          lineToRelative(dx = 9.3f, dy = -9.3f)
          // a 1 1 0 0 0 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // M 19.6 28
          moveTo(x = 19.6f, y = 28.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // v -1.59
          verticalLineToRelative(dy = -1.59f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // L 24.59 23z
          lineTo(x = 24.59f, y = 23.0f)
          close()
          // M 26 21.59
          moveTo(x = 26.0f, y = 21.59f)
          // L 24.41 20
          lineTo(x = 24.41f, y = 20.0f)
          // L 26 18.41
          lineTo(x = 26.0f, y = 18.41f)
          // L 27.59 20z
          lineTo(x = 27.59f, y = 20.0f)
          close()
          // M 20 13
          moveTo(x = 20.0f, y = 13.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.14
          horizontalLineToRelative(dx = -2.14f)
          // a 4 4 0 0 0 -0.43 -1.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.43f,
            dy1 = -1.02f,
          )
          // l 1.52 -1.52
          lineToRelative(dx = 1.52f, dy = -1.52f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // l -1.52 1.52
          lineToRelative(dx = -1.52f, dy = 1.52f)
          // A 4 4 0 0 0 15 8.14
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 8.14f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.14
          verticalLineToRelative(dy = 2.14f)
          // a 4 4 0 0 0 -1.02 0.43
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.02f,
            dy1 = 0.43f,
          )
          // l -1.52 -1.52
          lineToRelative(dx = -1.52f, dy = -1.52f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // l 1.52 1.52
          lineToRelative(dx = 1.52f, dy = 1.52f)
          // A 4 4 0 0 0 10.14 11
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.14f,
            y1 = 11.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.14
          horizontalLineToRelative(dx = 2.14f)
          // a 4 4 0 0 0 0.43 1.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.43f,
            dy1 = 1.02f,
          )
          // l -1.52 1.52
          lineToRelative(dx = -1.52f, dy = 1.52f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // l 1.52 -1.52
          lineToRelative(dx = 1.52f, dy = -1.52f)
          // A 4 4 0 0 0 13 15.86
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 15.86f,
          )
          // V 18
          verticalLineTo(y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.14
          verticalLineToRelative(dy = -2.14f)
          // a 4 4 0 0 0 1.02 -0.43
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.02f,
            dy1 = -0.43f,
          )
          // l 1.52 1.52
          lineToRelative(dx = 1.52f, dy = 1.52f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // l -1.52 -1.52
          lineToRelative(dx = -1.52f, dy = -1.52f)
          // A 4 4 0 0 0 17.86 13z
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.86f,
            y1 = 13.0f,
          )
          close()
          // m -6 1
          moveToRelative(dx = -6.0f, dy = 1.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
        }
        // M12 30 H6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v10 h-2 V4 H6 v24 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 30
          moveTo(x = 12.0f, y = 30.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
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
      .also { _licenseMaintenanceDraft = it }
  }

@Suppress("ObjectPropertyName")
private var _licenseMaintenanceDraft: ImageVector? = null
